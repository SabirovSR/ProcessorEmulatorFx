package org.example.processoremulatorfx.BModels;

import org.example.processoremulatorfx.Models.ProgramModel;

public class BProgramModel {
    static ProgramModel programModel = new ProgramModel();

    // Получить модельку
    public static ProgramModel build()  { return programModel; }
}
