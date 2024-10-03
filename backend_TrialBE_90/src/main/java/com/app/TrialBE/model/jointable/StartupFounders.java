package com.app.TrialBE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.TrialBE.model.Stage;
import com.app.TrialBE.model.Startup;
import com.app.TrialBE.model.FundingRound;
import com.app.TrialBE.model.Founder;
import com.app.TrialBE.model.Document;
import com.app.TrialBE.model.Investor;
import com.app.TrialBE.enums.RoundStatus;
import com.app.TrialBE.enums.StageName;
import com.app.TrialBE.converter.StageNameConverter;
import com.app.TrialBE.converter.RoundStatusConverter;

@Entity(name = "StartupFounders")
@Table(schema = "\"trialbe_610\"", name = "\"StartupFounders\"")
@Data
public class StartupFounders{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"FId\"")
    private Integer fId;
 
}