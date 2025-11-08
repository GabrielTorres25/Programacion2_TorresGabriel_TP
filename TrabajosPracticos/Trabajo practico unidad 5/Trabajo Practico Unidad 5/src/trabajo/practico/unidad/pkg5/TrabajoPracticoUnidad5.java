package trabajo.practico.unidad.pkg5;

import trabajo.practico.unidad.pkg5.Ejercicio14.Render;
import trabajo.practico.unidad.pkg5.Ejercicio14.EditorVideo;
import trabajo.practico.unidad.pkg5.Ejercicio14.Proyecto;
import trabajo.practico.unidad.pkg5.Ejercicio13.Usuario;
import trabajo.practico.unidad.pkg5.Ejercicio13.GeneradorQR;
import trabajo.practico.unidad.pkg5.Ejercicio13.CodigoQR;
import trabajo.practico.unidad.pkg5.Ejercicio12.Contribuyente;
import trabajo.practico.unidad.pkg5.Ejercicio12.Calculadora;
import trabajo.practico.unidad.pkg5.Ejercicio12.Impuesto;



public class TrabajoPracticoUnidad5 {


    public static void main(String[] args) {
        //Ejercicios de Relaciones 1 a 1 
        
       /*
        //Ejercicio 1 
        Titular titular = new Titular("Tomas Fanta", 12345678);
        Pasaporte pasaporte = new Pasaporte(98765, "16/10/2025");
        pasaporte.setTitular(titular)        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
        */
       
       /*
        //Ejercicio 2
        Usuario user = new Usuario("Gabriel",4564655);  
        Bateria bat = new Bateria("xs5c", "45amperes"); 
        Celular cel = new Celular(51555.21, "motorola", "motoG50", bat);
        cel.setUsuario(user); 
        cel.mostrarCelu();
        user.setCelular(cel);
        user.mostrarInf();
        */
      
       /*
        //Ejercicio 3
        Autor aut = new Autor("Gabriel G.M.", "Colombiano como la teoria");
        Editorial edit = new Editorial("La tablada", "La tablada 1231");
        Libro lib = new Libro("100 anios de soledad", "sad54513", aut, edit);

        lib.mostrarInfo();     
        System.out.println("Autor del libro: " +lib.getAutor().getNombre());
        System.out.println("Editorial del libro: "+ lib.getEdit().getDireccion());
         */
       /*
        //Ejercicio 4
        TarjetaDeCredito tar = new TarjetaDeCredito(1654648, "05-08-2030"); 
        Cliente cus = new Cliente("Torres Gabriel", 55435123); 
        Banco ban = new Banco("Banco Falso", "564-25465451-5"); 
        
        tar.setCliente(cus);
        tar.setBanco(ban);
        cus.setTc(tar);
        tar.mostrarDatos();
        cus.mostrarDatos(); 
     */
       /* 
        //Ejercicio 5
        Computadora pc = new Computadora("philips", 46.5431, "45sd6g1s4d3", "Chip26513X");
        Propietario pp = new Propietario("Senior X", 54654984); 
        
        pc.setPp(pp);
        pp.setPc(pc);
        
        pp.mostrarInfo();
        pc.mostrarInfo();
        
        System.out.println(pc.getMarca());
        
       *//*
        //Ejercicio 6   
        Mesa mesa = new Mesa(15, 4); 
        ClienteEj6 cliente = new ClienteEj6("Gabriel", 48851313);  
        Reserva reserva = new Reserva("20 de abril", "14hs", mesa);
        reserva.setCliente(cliente);
     
        reserva.mostrarReserva();
        System.out.println(reserva.getCliente());
        System.out.println(reserva.getFecha());
        */
       /*
        //Ejercicio 7
        Motor motor = new Motor("Nafta", 54651); 
        Vehiculo auto = new Vehiculo("ABC-123", "VW POLO", motor);
        Conductor yo = new Conductor("Gabriel", "A1- B1"); 
        
        auto.setConductor(yo);
        yo.setVehiculo(auto);
        auto.mostrarAuto();
        yo.mostrarConductor();
        System.out.println("Licencia de conducir tipo: " + yo.getLicencia());
        */
        /*
        //Ejercicio 8
        Usuario user = new Usuario("Gabriel", "Gabi@mail.com"); 
        Documento doc = new Documento ("Constancia de dni", "Dni", user); 
        doc.mostrarDoc();
        System.out.println(doc.getFirma());
        */
        /*
        //Ejercicio 9 
        Paciente p = new Paciente("Gabriel", "Apross");
        Profesional doc = new Profesional("Doc oc.", "Oculista"); 
        CitaMedica cit = new CitaMedica("15 de Noviembre", "14hs", p, doc); 
        cit.mostrarCita();
        */
        /*
        //Ejercicio 10
        Titular tit = new Titular("El Gato Gaton", 46548654); 
        CuentaBancaria cta = new CuentaBancaria(564646594, 184915.05); 
        tit.setCta(cta);
        cta.setTitular(tit);
        System.out.println("El titular de la cuenta es: "+ cta.getTitular()); 
        System.out.println("El titular de la cuenta es: "+ tit.getNombre());
        System.out.println("Dni del titular: " + tit.getDni());
        cta.mostrarCta();
        */
        /*
        //DEPENDENCIA DE USO 
        //Ejercicio 11 
        Artista art = new Artista("Julian Alvarez", "la y la m qsy"); 
        Cancion tema = new Cancion("La bestia de Calchin Records", art); 
        System.out.println(art.getNombre());
        System.out.println(art.toString()); 
        System.out.println(tema.toString());
        Reproductor rep = new Reproductor();  
        rep.reproducirMusica(tema); 
        */
        /*
        //Ejercicio 12
        Contribuyente cont = new Contribuyente("Gabriel", "22-4651484-4"); 
        Impuesto imp = new Impuesto(645646.45, cont); 
        System.out.println(imp.getMonto());
        Calculadora cal = new Calculadora(); 
        cal.calcular(imp);
        */
        /*
        //DEPENDENCIA DE CREACIÓN
        //Ejercicio 13 
        Usuario user = new Usuario("Gabriel", "Gabi@mail.com"); 
        GeneradorQR gnd = new GeneradorQR();
        CodigoQR nuevoQr = gnd.generar("fsf46546", user); 
        */
        /*
        //Ejercicio 14 
        Proyecto pro = new Proyecto("Javaclass", "15minutos, 33segundos");
        EditorVideo ed = new EditorVideo(); 
        Render ren = ed.exportar("mp4, HD ", pro); 
        System.out.println("nombre del proyecto: "+pro.getNombre());
        */
        
    }
}

// Cada carpeta contiene sus respectivos main para probar el codigo de manera rapido y sencilla:) 

