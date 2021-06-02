using System;
using Microsoft.EntityFrameworkCore.Migrations;

namespace S_Facturacion.Migrations
{
    public partial class AddS_FacturacionToDb : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Factura",
                columns: table => new
                {
                    f_id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    f_nRFC = table.Column<string>(nullable: false),
                    f_tipoUso = table.Column<string>(nullable: false),
                    f_tipoPago = table.Column<string>(nullable: true),
                    f_nomRsoc = table.Column<int>(nullable: false),
                    f_calle = table.Column<string>(nullable: false),
                    f_colonia = table.Column<string>(nullable: true),
                    f_codPostal = table.Column<int>(nullable: false),
                    f_nExt = table.Column<int>(nullable: false),
                    f_delegacion = table.Column<string>(nullable: true),
                    f_pais = table.Column<string>(nullable: true),
                    f_nInt = table.Column<string>(nullable: true),
                    f_ciudad = table.Column<string>(nullable: true),
                    f_email = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Factura", x => x.f_id);
                });

            migrationBuilder.CreateTable(
                name: "Ticket",
                columns: table => new
                {
                    t_id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:Identity", "1, 1"),
                    t_nEstacion = table.Column<int>(nullable: false),
                    t_nFolio = table.Column<int>(nullable: false),
                    t_nWebId = table.Column<int>(nullable: false),
                    t_fecha = table.Column<DateTime>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Ticket", x => x.t_id);
                });
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Factura");

            migrationBuilder.DropTable(
                name: "Ticket");
        }
    }
}
