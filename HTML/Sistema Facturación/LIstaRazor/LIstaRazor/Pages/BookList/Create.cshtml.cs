using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LIstaRazor.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace LIstaRazor.Pages.BookList
{
    public class CreateModel : PageModel
    {
        private readonly AplicatioDbContext _db;

        public CreateModel(AplicatioDbContext db)
        {
            _db = db;
        }

        [BindProperty]
        public Book Book { get; set; }

        public void OnGet()
        {

        }

        //En el siguiente controlador, pedimos que lo que se mande 'onpost', sea un objeto del tipo book, de igual forma esa en
        //la linea 20 [BindProperty]

        public async Task<IActionResult> OnPost()
        {
            if (ModelState.IsValid)
            {
                //Aquí estamos dando por sentado que estamos recibiendo un Objeto Book.
                //Pero no lo hemos guardado.

                await _db.Book.AddAsync(Book);
                await _db.SaveChangesAsync();
                return RedirectToPage("Index");
            }
            else
            {
                return Page();
            }
        }
    }
}
