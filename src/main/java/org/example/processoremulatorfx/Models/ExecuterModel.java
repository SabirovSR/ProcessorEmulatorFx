package org.example.processoremulatorfx.Models;

import org.example.processoremulatorfx.BModels.BCpuModel;
import org.example.processoremulatorfx.BModels.BProgramModel;
import org.example.processoremulatorfx.IObserver;

import java.util.ArrayList;

public class ExecuterModel {
  CpuModel cpuModel = BCpuModel.build();
  ProgramModel programModel = BProgramModel.build();
  private int iter = 0;
  public int getIter() { return iter; }

  ArrayList<IObserver> allObserver = new ArrayList<>();
  void eventCall(){
    allObserver.forEach(action->action.event(this));
  }
  public void addObserver(IObserver e){
    allObserver.add(e);
    eventCall();
  }

  public void run() {
    iter = 0;
    for (int i = 0; iter < programModel.allCommands.size(); i++) {
      cpuModel.exec(programModel.allCommands.get(i));
      iter++;
    }
    iter--;
    eventCall();
  }

  public void runDebug() throws Exception {
    if (iter < programModel.allCommands.size()-1){
      cpuModel.exec(programModel.allCommands.get(iter));
      iter++;
      eventCall();
    }
    else throw new Exception("Program is end");
  }

  public void reset() {
    iter = 0;
    cpuModel.ClearMemoryAndRegister();
    eventCall();
  }
}
