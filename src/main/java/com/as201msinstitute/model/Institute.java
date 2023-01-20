package com.as201msinstitute.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "institute")
public class Institute {
    @Id private Long id;
    @Column private String name;
    @Column private String ruc;
    @Column private boolean active;
}
