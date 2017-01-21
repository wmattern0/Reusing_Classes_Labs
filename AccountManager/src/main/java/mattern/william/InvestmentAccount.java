package mattern.william;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.SortedSet;

/**
 * Created by williammattern on 1/20/17.
 */
public class InvestmentAccount extends Account {
    EnumSet<SuitabilityType> investmentSuitability;
    enum SuitabilityType {EQUITY,FIXED_INCOME,ALTERNATIVES}

    public void addSuitability(SuitabilityType suitabilityType){
        this.investmentSuitability.add(suitabilityType);
    }

    public void removeSuitability(SuitabilityType suitabilityType){
        while(this.investmentSuitability.remove(suitabilityType)){}
    }

    public EnumSet<SuitabilityType> getInvestmentSuitability() {
        return investmentSuitability;
    }
}
