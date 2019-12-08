package com.example.mislugares;

import java.util.ArrayList;
import java.util.List;

class Lugar {
    public String nombre;
    public String descripcion;
    public String nombreRegion;

    public Lugar(String nombre, String descripcion, String nombreRegion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreRegion = nombreRegion;
    }

    public static List<Lugar> ejemploLugares(){
        List<Lugar> lugares = new ArrayList<>();
        lugares.add(new Lugar("El Salar","Reserva natural de sal","Uyuni-Potosí-Bolivia"));
        lugares.add(new Lugar("El Amazonas","El bosque mas grande del mundo","Amazonas-Brazil"));
        lugares.add(new Lugar("Las Tres Piramides egipcias","Restos argueológicos de Egipto","El cairo-Egipto"));
        lugares.add(new Lugar("Las Vegas","Ciudad de juegos y apuestas","Nevada-EE.UU"));
        lugares.add(new Lugar("El Himalaya","La cadena de cerros mas alta del mundo","Himalaya-Asia"));
        lugares.add(new Lugar("El Gran Cañon","Formaciones rocosas naturales","Arizona-EE.UU"));
        lugares.add(new Lugar("Casa de la Libertad","Edificio, y patrimonio nacional","Sucre-Bolivia"));
        lugares.add(new Lugar("La Torre Eiffel","Edificio,arquitectónico","Londres-Inglaterra"));
        lugares.add(new Lugar("Casa de la Libertad","Edificio, y patrimonio nacional","Sucre-Bolivia"));
        lugares.add(new Lugar("La Patagonia","Reserva natural","Argentina"));
        lugares.add(new Lugar("Machu Picchu","Restos arguqológicos de la Cultura Inca","Perú"));
        lugares.add(new Lugar("Angkor","capital del antiguo imperio jemer","Camboya"));
        lugares.add(new Lugar("Taj Mahal","La Tumba mas grande del mundo","India"));
        lugares.add(new Lugar("La Gran Muralla","La muralla mas grande del mundo","China"));
        lugares.add(new Lugar("Tikal","Restos de la civilización Maya","Guatemala"));
        lugares.add(new Lugar("Yellostone","Reserva natural","EE.UU"));
        lugares.add(new Lugar("Ubu Simbel","Templo egipcio","Egipto"));
        lugares.add(new Lugar("Cráter del Ngorongoro","Una de las calderas mas grnades del mundo","Tanzania"));
        lugares.add(new Lugar("Borobudur","El monumento budista mas grande del mundo","Java-Indonecia"));
        lugares.add(new Lugar("Sigiriya"," el lugar arqueológico más importante de Sri Lanka","Sri Lanka"));
        return lugares;
    }
}
