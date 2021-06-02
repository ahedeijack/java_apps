using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LIstaRazor.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace LIstaRazor.Controllers
{
    [Route("api/Book")]
    [ApiController]
    public class BookController : Controller
    {
        
        private readonly AplicatioDbContext _db;

        public BookController(AplicatioDbContext db)
        {
            _db = db;
        }

        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Json(new { data =await _db.Book.ToListAsync() });
        }

        [HttpDelete]
        public async Task<IActionResult> Delete(int id)
        {
            var bookFromDb = await _db.Book.FirstOrDefaultAsync(u=>u.id == id);
            if (bookFromDb ==null)
            {
                return Json(new { success = false, message = "Hubo un error al eliminar." });
            }
            _db.Book.Remove(bookFromDb);
            await _db.SaveChangesAsync();
            return Json(new { success = true, message = "Se elimino correctamente."});
        }
    }
}
