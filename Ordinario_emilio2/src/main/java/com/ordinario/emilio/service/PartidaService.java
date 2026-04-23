package com.ordinario.emilio.service;

import com.ordinario.emilio.entity.EstadoPartida;
import com.ordinario.emilio.entity.Jugador;
import com.ordinario.emilio.entity.Partida;
import com.ordinario.emilio.entity.Tiro;
import com.ordinario.emilio.repository.JugadorRepository;
import com.ordinario.emilio.repository.PartidaRepository;
import com.ordinario.emilio.repository.TiroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class PartidaService {
BeanPartida partida = new BeanPartida();
partida.setJugador(jugador);
partida.setApuesta(apuesta);

 if (partida.getEstado() != EstadoPartida.EN_JUEGO) {
            throw new RuntimeException("La partida no esta en juego");
                int valorDado1 = random.nextInt(6) + 1;
                int valorDado2 = random.nextInt(6) + 1;
                int suma = valorDado1 + valorDado2;
    }
    //Final de la partida
     public BeanPartida finalizarPartidaManual(Long partidaId) {
        BeanPartida partida = partidaRepository.findById(partidaId)
                .orElseThrow(() -> new RuntimeException("Partida no encontrada"));

        if (partida.getEstado() != EstadoPartida.FINALIZADA) {
            partida.setEstado(EstadoPartida.FINALIZADA);
            partidaRepository.save(partida);
        }

        return partida;
    }
}
