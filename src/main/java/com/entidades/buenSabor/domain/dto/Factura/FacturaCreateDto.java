package com.entidades.buenSabor.domain.dto.Factura;

import com.entidades.buenSabor.domain.enums.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FacturaCreateDto {
    private LocalDate fechaFacturacion;
    private FormaPago formaPago;
    private Double totalVenta;
}
