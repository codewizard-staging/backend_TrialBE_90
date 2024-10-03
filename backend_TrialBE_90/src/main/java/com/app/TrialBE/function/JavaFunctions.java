package com.app.TrialBE.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.TrialBE.repository.FundingRoundRepository;
import com.app.TrialBE.repository.StageRepository;
import com.app.TrialBE.repository.DocumentRepository;
import com.app.TrialBE.repository.InvestorRepository;
import com.app.TrialBE.repository.FounderRepository;
import com.app.TrialBE.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
