package com.wdz.architecture.gradleconfig

import org.gradle.api.Plugin
import org.gradle.api.Project

public class ConfigPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("hello word!!!  :gradle-config:createwdzConfigTask");
        project.tasks.create("wdzConfig", ConfigTask.class);
    }
}