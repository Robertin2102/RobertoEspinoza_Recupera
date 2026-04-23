package com.ordinario.emilio.service;

import com.ordinario.emilio.dto.CrearJugadorRequest;
import com.ordinario.emilio.entity.Jugador;
import com.ordinario.emilio.repository.JugadorRepository;
import org.springframework.stereotype.Service;

@Service
public class JugadorService {
    
    BeanJugador jugador = jugadorRepository.findById(jugadorId)

    if (jugador.getActivo = FALSE 
        newException ("Jugador sin encontrar"));

      if ( jugador.getSaldo() < apuesta){
    throw newException("el saldo esta bien");
        }
        jugador.setSaldo(jugador.getSaldo() - apuesta);
            jugadorRepository.save(jugador);
    }

