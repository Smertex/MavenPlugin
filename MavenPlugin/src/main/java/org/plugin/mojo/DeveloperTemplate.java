package org.plugin.mojo;

import org.apache.maven.model.Developer;

import java.util.List;

public class DeveloperTemplate {

    String printDevelopers(List<Developer> developers){
        final String developersConsoleTemplate = "\nDevelopers: %s";
        final String splitLine = "--------------------";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("\n")
                .append(splitLine)
                .append("\n");
        developers.forEach(developer -> stringBuilder
                .append(buildDeveloperString(developer))
                .append(splitLine)
                .append("\n")
        );
        return developersConsoleTemplate.formatted(
                stringBuilder.toString()
        );
    }

    private String buildDeveloperString(Developer developer){
        StringBuilder stringBuilder = new StringBuilder();

        if(developer.getId() != null)
            stringBuilder.append("id: ").append(developer.getId()).append("\n");
        if(developer.getName() != null)
            stringBuilder.append("name: ").append(developer.getName()).append("\n");
        if(developer.getEmail() != null)
            stringBuilder.append("email: ").append(developer.getEmail()).append("\n");
        if(developer.getRoles() != null)
            stringBuilder.append("roles: ").append(developer.getRoles()).append("\n");
        if(developer.getUrl() != null)
            stringBuilder.append("url: ").append(developer.getUrl()).append("\n");
        if(developer.getOrganization() != null)
            stringBuilder.append("organization: ").append(developer.getOrganization()).append("\n");
        if(developer.getOrganizationUrl() != null)
            stringBuilder.append("organizationUrl: ").append(developer.getOrganizationUrl()).append("\n");
        if(developer.getTimezone() != null)
            stringBuilder.append("timezone: ").append(developer.getTimezone()).append("\n");

        return stringBuilder.toString();
    }
}
