package com.vareli.tecsoft.vcommute_business.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vareli.tecsoft.vcommute_business.audit.Auditable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "mst_attendance")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate" })
public class Attendance extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long customerId;
    private LocalDate startDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private LocalTime endTime;
    private Double startLat;
    private Double startLong;
    private String startLocation;
    private String startLocationArea;
    private Double endLat;
    private Double endLong;
    private String endLocation;
    private String endLocationArea;
    private boolean status;
    private Integer superCompanyId;
    private Integer companyId;
    private String purpose;

    @Transient
    private String name;
    @Transient
    private String userName;
    @Transient
    private String employeeId;
    @Transient
    private String customerName;
    @Transient
    private String customerLocation;
    @Transient
    private String companyName;
}
