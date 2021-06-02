using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using S_Facturacion.Model;

namespace S_Facturacion.Pages.Paginas
{
    public class IndexModel : PageModel
    {
        private readonly AppDbContext _db;

        public IndexModel(AppDbContext db)
        {
            _db = db;
        }

        public IEnumerable<Ticket> Ticket { get; set; }
        public async Task OnGet()
        {
            Ticket = await _db.Ticket.ToListAsync();
        }

        [BindProperty]
        public Ticket nuevoTicket { get; set; }

        public async Task<IActionResult> OnPost(int id)
        {
            if (ModelState.IsValid)
            {
                await _db.Ticket.AddAsync(nuevoTicket);
                await _db.SaveChangesAsync();
                return RedirectToPage("Index");
            } else
            {
                return Page();
            }
        }

    }
}
