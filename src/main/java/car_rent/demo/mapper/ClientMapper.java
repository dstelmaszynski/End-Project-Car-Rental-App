package car_rent.demo.mapper;


import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ClientDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ClientEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ClientMapper {

    public static ClientDto mapEntityToDto(ClientEntity entity){
        ClientDto dto = new ClientDto();
        dto.setClientVorname(entity.getClientVorname());
        dto.setClientSurname(entity.getClientSurname());
        dto.setClientAddress(entity.getClientAddress());
        dto.setClientEmail(entity.getClientEmail());
        return dto;
    }

    public static List<ClientDto> mapEntityListToDtoList (Iterable<ClientEntity> entities) {

        List<ClientDto> dtos = new ArrayList<>();

        for (ClientEntity entity:entities) {
            dtos.add(mapEntityToDto(entity));

        }
        return dtos;
    }

    public static ClientEntity mapDtoToEntity(ClientDto dto) throws ParseException {

        ClientEntity entity = new ClientEntity();
        entity.setClientVorname(dto.getClientVorname());
        entity.setClientSurname(dto.getClientSurname());
        entity.setClientAddress(dto.getClientAddress());
        entity.setClientEmail(dto.getClientEmail());
        return entity;
    }
}
