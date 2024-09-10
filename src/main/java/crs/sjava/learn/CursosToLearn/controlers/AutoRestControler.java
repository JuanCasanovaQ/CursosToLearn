package crs.sjava.learn.CursosToLearn.controlers;

import crs.sjava.learn.CursosToLearn.models.Autos;
import crs.sjava.learn.CursosToLearn.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos/")
public class AutoRestControler {
    private AutoService autoService;
    @Autowired
    public AutoRestControler(AutoService autoService){
        this.autoService = autoService;
    }
    @PostMapping(value = "crear", headers = "Accept=application/json")
    public void crearAuto(@RequestBody Autos autos){
        autoService.crearAuto(autos);
    }
    @GetMapping(value = "listar", headers = "Accept=application/json")
    public List<Autos> listarAutos(){
       return autoService.listarAutos();
    }
    @GetMapping(value = "listarPorId/{id}", headers = "Accept=application/json")
    public Optional<Autos> buscarPorAutos(@PathVariable Long id){
        return autoService.buscarAutoPorId(id);
    }
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAutos(@RequestBody Autos auto){
        autoService.actualizarAuto(auto);
    }
    @DeleteMapping(value = "eliminar/{id}", headers = "Accept=application/json")
    public void eliminarAutos(@PathVariable Long id){
        autoService.eliminarAutoPorId(id);
    }
    // Para propiedades del auto
    @GetMapping(value = "listarMarca/{marca}", headers = "Accept=application/json")
    public List<Autos> listarAutosPorMarca(@PathVariable String marca){
        return autoService.listarAutosPorMarca(marca);
    }
    @GetMapping(value = "listarModelo/{modelo}", headers = "Accept=application/json")
    public List<Autos> listarAutosPorModelo(@PathVariable String modelo){
        return  autoService.listarAutosPorModelo(modelo);
    }
    @GetMapping(value = "listarColor/{color}", headers = "Accept=application/json")
    public List<Autos> listarAutosporColor(@PathVariable String color){
        return autoService.listarAutosPorColor(color);
    }
    @GetMapping(value = "listarAnio/{anio}", headers = "Accept=application/json")
    public List<Autos> listarAutosPorAnio(@PathVariable Long anio){
        return autoService.listarAutosPorAnio(anio);
    }
}
