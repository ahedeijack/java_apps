using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LIstaRazor.Model
{
    public class AplicatioDbContext : DbContext
    {
        public AplicatioDbContext(DbContextOptions<AplicatioDbContext> options) : base(options) //Las opciones en base a la aplicación.
        {

        }

        public DbSet<Book> Book { get; set; } //* Se añade el contexto con el que va a funcionar nuestro sistema, en este caso, book.
    }
}
