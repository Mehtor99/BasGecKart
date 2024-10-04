package org.mehtor.basgeckart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@SuperBuilder
@Data
@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Builder.Default
	Integer state = 1;
	@Builder.Default
	LocalDateTime createdAt = LocalDateTime.now();
	@Builder.Default
	LocalDateTime updatedAt = LocalDateTime.now();
}