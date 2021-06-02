using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace S_Facturacion.Model
{
    public class Factura
    {
        [Key]
        public int f_id { get; set; } 

        [Required]
        public string f_nRFC { get; set; }

        [Required]
        public string f_tipoUso { get; set; }

        
        public string f_tipoPago { get; set; }

        [Required]
        public int f_nomRsoc { get; set; }

        [Required]
        public string f_calle { get; set; }
        public string f_colonia { get; set; }
        public int f_codPostal { get; set; }
        public int f_nExt { get; set; }
        public string f_delegacion { get; set; }
        public string f_pais { get; set; }
        public string f_nInt { get; set; }
        public string f_ciudad { get; set; }
        public string f_email { get; set; }
    }
}
