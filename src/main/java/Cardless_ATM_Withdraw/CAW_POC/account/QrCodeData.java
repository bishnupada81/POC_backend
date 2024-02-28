package Cardless_ATM_Withdraw.CAW_POC.account;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class QrCodeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long qrId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountDetails accountDetails;

    @Column(columnDefinition = "TEXT")
    private String qrDetails;
}
