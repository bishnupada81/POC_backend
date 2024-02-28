package Cardless_ATM_Withdraw.CAW_POC.account;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class SetPin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pinId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountDetails accountDetails;

    private String phoneNumber;
    private String pin;
    private Date createdAt;
}
