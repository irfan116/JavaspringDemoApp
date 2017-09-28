package com.example.demoapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:bp.properties"})
public class BloodPressureEvaluationService {

    @Value("${bp.critical.minSys}")
    private Integer criticalMinSys;

    @Value("${bp.critical.minDia}")
    private Integer criticalMinDia;

    @Value("${bp.elevated.minSys}")
    private Integer elevatedMinSys;

    @Value("${bp.elevated.minDia}")
    private Integer elevatedMinDia;

    public BloodPressureStatus getStatus(Integer systolic,Integer diastolic){
        if(systolic > 250 || diastolic > 140){
            throw new IllegalArgumentException();
        }else if(diastolic >= criticalMinDia || systolic >= criticalMinSys) {
            return BloodPressureStatus.CRITICAL;
        } else if(diastolic >= elevatedMinDia || systolic >= elevatedMinSys) {
            return BloodPressureStatus.ELEVATED;
        } else {
            return BloodPressureStatus.NORMAL;
        }
    }

    public Integer getCriticalMinDia() {
        return criticalMinDia;
    }

    public Integer getCriticalMinSys() {
        return criticalMinSys;
    }

    public Integer getElevatedMinDia() {
        return elevatedMinDia;
    }

    public Integer getElevatedMinSys() {
        return elevatedMinSys;
    }
}
