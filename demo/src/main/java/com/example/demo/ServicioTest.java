package com.example.demo;

import org.junit.jupiter.api;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

class ServicioTest {
    @Test
    void testServicio() {

// Creamos un mock de una clase
        Servicio servicioMock = Mockito.mock(Servicio.class);
// Definimos el comportamiento simulado
        when(servicioMock.obtenerMensaje()).thenReturn("Hola, Mockito!");
// Ejecutamos el método simulado
        String resultado = servicioMock.obtenerMensaje();
// Verificamos que se llamó correctamente
        verify(servicioMock).obtenerMensaje();
        System.out.println(resultado); // Imprime: Hola, Mockito!
    }

}
