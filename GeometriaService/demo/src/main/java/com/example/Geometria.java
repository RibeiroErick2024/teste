package com.example;


//Geometria


public class Geometria {
    
public double CalcularAreaTriangulo (double base, double altura){
    return (base * altura / 2  );
}


public double CalcularAreaQuadrado(double lado){
    return (lado * lado);
}


public double CalcularAreaCirculo(double raio){
    if (raio <= 0){
        return 0;
    }
    //(A = π r²).
    return (raio = Math.PI * raio * raio);
    
}

public double CalcularAreaRetangulo(double comprimento, double largura){
    return (comprimento * largura);
}


public double CalcularVolumeCubo(double aresta){
   // Volume = a³
    return (aresta * aresta * aresta);
}


public double CalcularVolumeEsfera(double raio){

    //Volume = (4/3) * π * r³
    return ((4.0 / 3.0 ) * Math.PI * Math.pow(raio, 3));
}

public double CalcularVolumeCilindro(double base, double altura ){
//Volume=πr2h

    return (Math.PI* Math.pow(base, 2)*altura);
}







}
