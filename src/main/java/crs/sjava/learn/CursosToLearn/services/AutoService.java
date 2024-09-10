package crs.sjava.learn.CursosToLearn.services;

import crs.sjava.learn.CursosToLearn.models.Autos;
import crs.sjava.learn.CursosToLearn.repositories.IAutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {
    private IAutosRepository autosRepository;
    @Autowired
    public AutoService(IAutosRepository autosRepository){
        this.autosRepository = autosRepository;
    }

    public void crearAuto(Autos auto){
        autosRepository.save(auto);
    }
    public List<Autos> listarAutos(){
        return autosRepository.findAll();
    }
    public Optional<Autos> buscarAutoPorId(Long id){
        return autosRepository.findById(id);
    }

    public void actualizarAuto(Autos auto){
        autosRepository.save(auto);
    }
    public void eliminarAutoPorId(Long id){
        autosRepository.deleteById(id);
    }

    // Buscar por propiedades
    public List<Autos> listarAutosPorMarca(String marca){
        return autosRepository.findByMarca(marca);
    }
    public List<Autos> listarAutosPorModelo(String modelo){
        return autosRepository.findByModelo(modelo);
    }
    public List<Autos> listarAutosPorColor(String color){
        return autosRepository.findByColor(color);
    }
    public List<Autos> listarAutosPorAnio(Long anio){
        return autosRepository.findByAnio(anio);
    }


}
