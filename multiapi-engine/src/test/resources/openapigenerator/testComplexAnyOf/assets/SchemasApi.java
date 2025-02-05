package net.coru.multifileplugin.testcomplexanyof.api;

import java.util.Optional;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import net.coru.multifileplugin.testcomplexanyof.model.ApiSchemaDTO;

public interface SchemasApi {

  /**
  * GET /schemas/names 
  * @return  OK; (status code 200)  Bad Request; (status code 400)  Not Found; (status code 404)  Server Error; (status code 500)
  */

  @Operation(
     operationId = "getAllSchemaNames",
     tags = {"schemas"},
     responses = {
       @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
       @ApiResponse(responseCode = "400", description = "Bad Request"),
       @ApiResponse(responseCode = "404", description = "Not Found"),
       @ApiResponse(responseCode = "500", description = "Server Error")
     }
  )
  @RequestMapping(
    method = RequestMethod.GET,
    value = "/schemas/names",
    produces = {"application/json"}
  )

  default ResponseEntity<String> getAllSchemaNames() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
  /**
  * GET /schemas 
  * @return  OK; (status code 200)  Bad Request; (status code 400)  Not Found; (status code 404)  Server Error; (status code 500)
  */

  @Operation(
     operationId = "getSchemas",
     tags = {"schemas"},
     responses = {
       @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = List.class))),
       @ApiResponse(responseCode = "400", description = "Bad Request"),
       @ApiResponse(responseCode = "404", description = "Not Found"),
       @ApiResponse(responseCode = "500", description = "Server Error")
     }
  )
  @RequestMapping(
    method = RequestMethod.GET,
    value = "/schemas",
    produces = {"application/json"}
  )

  default ResponseEntity<List<ApiSchemaDTO>> getSchemas() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
  /**
  * DELETE /schemas 
  * @return  OK; (status code 200)  Bad Request; (status code 400)  Not Found; (status code 404)  Server Error; (status code 500)
  */

  @Operation(
     operationId = "deleteSchemas",
     tags = {"schemas"},
     responses = {
       @ApiResponse(responseCode = "200", description = "OK"),
       @ApiResponse(responseCode = "400", description = "Bad Request"),
       @ApiResponse(responseCode = "404", description = "Not Found"),
       @ApiResponse(responseCode = "500", description = "Server Error")
     }
  )
  @RequestMapping(
    method = RequestMethod.DELETE,
    value = "/schemas",
    produces = {"application/json"}
  )

  default ResponseEntity<Void> deleteSchemas() {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}
