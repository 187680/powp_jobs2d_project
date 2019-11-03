package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements IDriverCommand {
    private List<IDriverCommand> driverCommandList;

    public ComplexCommand(List<IDriverCommand> driverCommandList){
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(IDriverCommand driverCommand : driverCommandList)
            driverCommand.execute(job2dDriver);
    }
}
