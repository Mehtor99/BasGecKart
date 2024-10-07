package org.mehtor.basgeckart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.mehtor.basgeckart.utility.enums.PaymentType;

@NoArgsConstructor   //Boş constructor oluşturur.
@AllArgsConstructor  //Full constructor oluştutur
@SuperBuilder
@Data
@Entity
@Table(name = "tblpayment")
public class Payment extends BaseEntity{
	
	PaymentType paymentType;
	@Column(unique = true, nullable = false)
	String cardNumber;
	Double balance;
	Long passengerId;
	
}