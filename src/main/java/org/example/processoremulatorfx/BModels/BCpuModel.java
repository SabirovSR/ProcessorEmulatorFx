package org.example.processoremulatorfx.BModels;

import org.example.processoremulatorfx.Models.CpuModel;

public class BCpuModel {
    static CpuModel cpu = new CpuModel();

    // Получить модельку
    public static CpuModel build()  { return cpu; }
}
