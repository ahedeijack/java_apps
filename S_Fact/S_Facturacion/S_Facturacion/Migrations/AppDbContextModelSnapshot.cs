﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using S_Facturacion.Model;

namespace S_Facturacion.Migrations
{
    [DbContext(typeof(AppDbContext))]
    partial class AppDbContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "3.1.1")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("S_Facturacion.Model.Factura", b =>
                {
                    b.Property<int>("f_id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("f_calle")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_ciudad")
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("f_codPostal")
                        .HasColumnType("int");

                    b.Property<string>("f_colonia")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_delegacion")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_email")
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("f_nExt")
                        .HasColumnType("int");

                    b.Property<string>("f_nInt")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_nRFC")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.Property<int>("f_nomRsoc")
                        .HasColumnType("int");

                    b.Property<string>("f_pais")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_tipoPago")
                        .HasColumnType("nvarchar(max)");

                    b.Property<string>("f_tipoUso")
                        .IsRequired()
                        .HasColumnType("nvarchar(max)");

                    b.HasKey("f_id");

                    b.ToTable("Factura");
                });

            modelBuilder.Entity("S_Facturacion.Model.Ticket", b =>
                {
                    b.Property<int>("id")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("int")
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<DateTime>("t_fecha")
                        .HasColumnType("datetime2");

                    b.Property<int>("t_nEstacion")
                        .HasColumnType("int");

                    b.Property<int>("t_nFolio")
                        .HasColumnType("int");

                    b.Property<int>("t_nWebId")
                        .HasColumnType("int");

                    b.HasKey("id");

                    b.ToTable("Ticket");
                });
#pragma warning restore 612, 618
        }
    }
}