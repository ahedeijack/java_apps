using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using S_Facturacion.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace S_Facturacion.Controllers
{
    [Route("api/Ticket")]
    [ApiController]
    public class TicketController : Controller
    {
        private readonly AppDbContext _db;

        public TicketController(AppDbContext db) {

            _db = db;
        }

        [HttpGet]
        public async Task<IActionResult> GetAll()
        {
            return Json(new { data = await _db.Ticket.ToListAsync() });
        }

        [HttpDelete]
        public async Task<IActionResult> Delete(int id)
        {
            var ticketFromDb = await _db.Ticket.FirstOrDefaultAsync(u =>u.id == id);

            if (ticketFromDb == null)
            {
                return Json(new { succes = false, message = "Hubo un error al quitar el ticket." });
            }

            _db.Ticket.Remove(ticketFromDb);
            await _db.SaveChangesAsync();
            return Json(new { succes = true, message = "Se elimino." });
        }


    }
}
