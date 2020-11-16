package car_rent.demo.service;


import car_rent.demo.dto.ClientDto;
import car_rent.demo.entity.ClientEntity;
import car_rent.demo.mapper.ClientMapper;
import car_rent.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDto> getAll(){
        Iterable<ClientEntity> entities = clientRepository.findAll();
        List<ClientDto> dtos = ClientMapper.mapClientListToDtoList(entities);

        return dtos;
    }

    public ClientDto createClient(ClientDto dto) {
        try {
            ClientEntity entity = ClientMapper.mapDtoToClient(dto);

            entity = clientRepository.save(entity);
            return  ClientMapper.mapClientToDto(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ClientDto getById(Integer id) {
        ClientEntity entity = clientRepository.getByClientId(id);
        return ClientMapper.mapClientToDto(entity);
    }
}
