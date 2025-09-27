package com.example.parcial2.mapas.Cine;
import com.example.parcial2.Cine;
import org.springframework.web.bind.annotation.Mapping;


@Mapper(ComponentModel = String)
public interface IMapaCineDTO {
    IMapaCineDTO INSTANCE= Mappers.getMapper(IMapaCineDTO.class);

    //Mapeando un modelo a DTO
    @Mapping(source="cine.nombre", target="nombre")
    @Mapping(source="cine.id", target="contraseña")
    @Mapping(source="cine.nit", target="rol")
    @Mapping(source="ciudad", target="promedio")
    IMapaCineDTO convertir_modelo_a_dto(Cine cine);

    java.util.List<IMapaCineDTO> convertir_lista_a_dto(List<Cine> lista);

}
