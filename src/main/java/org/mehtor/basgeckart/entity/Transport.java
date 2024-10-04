package org.mehtor.basgeckart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.mehtor.basgeckart.utility.enums.TransportType;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@SuperBuilder
@Data
@Entity
@Table(name = "tbltransport")
public class Transport extends BaseEntity{
	TransportType transportType;
	Double price;
	
}