package org.plugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "print-developers", defaultPhase = LifecyclePhase.COMPILE)
public class DeveloperMojo extends AbstractMojo {

    private final DeveloperTemplate developerTemplate;

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    @Override
    @SuppressWarnings("unchecked")
    public void execute() {
        getLog().info(developerTemplate.printDevelopers(
                project.getDevelopers()
        ));
    }

    public DeveloperMojo(){
        developerTemplate = new DeveloperTemplate();
    }
}
