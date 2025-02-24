package org.example.processoremulatorfx;

import org.example.processoremulatorfx.Models.*;

// Наблюдатель
public interface IObserver {
    void event(TrainModel e);
    void event(TrainsModel e);
}
