package org.mcimbora.domain;

import java.util.List;

import ai.timefold.solver.core.api.domain.solution.PlanningEntityCollectionProperty;
import ai.timefold.solver.core.api.domain.solution.PlanningScore;
import ai.timefold.solver.core.api.domain.solution.PlanningSolution;
import ai.timefold.solver.core.api.domain.solution.ProblemFactCollectionProperty;
import ai.timefold.solver.core.api.domain.valuerange.ValueRangeProvider;
import ai.timefold.solver.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class TestSolution {

    @PlanningEntityCollectionProperty
    private List<TestEntity> entities;

    @ValueRangeProvider
    @ProblemFactCollectionProperty
    private List<TestObject> objects;

    @PlanningScore
    private HardSoftScore score;

    public List<TestEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<TestEntity> entities) {
        this.entities = entities;
    }

    public List<TestObject> getObjects() {
        return objects;
    }

    public void setObjects(List<TestObject> objects) {
        this.objects = objects;
    }

    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }
}
