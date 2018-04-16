package cn.jbone.eb.portal.api;


import cn.jbone.common.api.dto.SearchListDTO;
import cn.jbone.common.rpc.Result;
import cn.jbone.eb.portal.api.dto.response.OperationPositionListByPageResponseDTO;
import cn.jbone.eb.portal.api.dto.response.OperationPositionRequestDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/operationPosition")
public interface OperationPositionApi {
    @RequestMapping(value = "/findByPage", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Result<OperationPositionListByPageResponseDTO> findByPage(@RequestBody SearchListDTO searchListDTO);

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void save(@RequestBody OperationPositionRequestDTO operationPositionRequestDTO);

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    void update(@RequestBody OperationPositionRequestDTO operationPositionRequestDTO);

    @RequestMapping(value = "/findById", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
    OperationPositionRequestDTO findById(@RequestBody Integer id);

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    void delete(@RequestBody String ids);
}
