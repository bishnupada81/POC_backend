package Cardless_ATM_Withdraw.CAW_POC.account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;

    private String accountHolderName;
    private String accountAddress;
    private String accountNumber;
    private String phoneNumber;
    private double accountBalance;

}
