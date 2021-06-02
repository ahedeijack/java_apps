using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LIstaRazor.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace LIstaRazor.Pages.BookList
{
    public class EditModel : PageModel
    {
        private AplicatioDbContext _db;

        public EditModel(AplicatioDbContext db)
        {
            _db = db;
        }

        [BindProperty]
        public Book Book { get; set; }


        public async Task OnGet(int id)
        {
            Book = await _db.Book.FindAsync(id);
        }

        public async Task<IActionResult> OnPost()
        {
            if(ModelState.IsValid){
                var BookFromDb = await _db.Book.FindAsync(Book.id);
                BookFromDb.Name = Book.Name;
                BookFromDb.ISBN = Book.ISBN;
                BookFromDb.Autor = Book.Autor;

                await _db.SaveChangesAsync();

                return RedirectToPage("Index");
            }
            return RedirectToPage("Index");
        }
    }
}
