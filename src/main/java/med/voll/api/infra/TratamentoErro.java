package med.voll.api.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class TratamentoErro {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratamentoDeErro() {
        return ResponseEntity.notFound().build();
    }
}
