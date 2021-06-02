using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace S_Facturacion.Model
{
    public class Ticket
    {
        [Key]
        public int id { get; set; }

        [Required]
        public int t_nEstacion { get; set; }

        [Required]
        public int t_nFolio { get; set; }

        [Required]
        public int t_nWebId { get; set; }

        [Required]
        public DateTime t_fecha { get; set; }
    }
}
