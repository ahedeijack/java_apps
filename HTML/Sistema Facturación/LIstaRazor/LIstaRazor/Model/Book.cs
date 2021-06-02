using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace LIstaRazor.Model
{
    public class Book
    {   
        [Key]
        public int id { get; set; }

        [Required]
        public String Name { get; set; }

        public string Autor { get; set; }

        // Cada que se modifique el archivo del objeto, se tiene que hacer una nueva migración. 
        // add-migration AddISBNToBookModel
        // después actualizamos la bas de datos 'update-database'
        public string ISBN { get; set; }


    }
}
