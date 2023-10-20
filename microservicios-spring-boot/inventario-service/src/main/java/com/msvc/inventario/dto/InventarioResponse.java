package com.msvc.inventario.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventarioResponse {

    private String codigoSku;
    private boolean inStock;

}
