package SubmissionForms.ArtSubmissionForm;

import java.util.ArrayList;

/**
 * Created by Nsyse on 2016-03-27.
 */
public class ArtSubmissionFormModel {

    private String submissionPath;
    private String submissionTitle;
    private String submissionDescription;
    private ArrayList<String> websitesNamesChosen;

    private String contentRating;

    public ArrayList<String> getSubmissionTags() {
        return submissionTags;
    }

    public void setSubmissionTags(ArrayList<String> submissionTags) {
        this.submissionTags = submissionTags;
    }

    private ArrayList<String> submissionTags;

    public ArtSubmissionFormModel(){
        submissionTags = new ArrayList<>();
    }

    public String getSubmissionDescription() {
        return submissionDescription;
    }

    public void setSubmissionDescription(String submissionDescription) {
        this.submissionDescription = submissionDescription;
    }

    public String getSubmissionTitle() {
        return submissionTitle;
    }

    public void setSubmissionTitle(String submissionTitle) {
        this.submissionTitle = submissionTitle;
    }

    public String getSubmissionPath() {
        return submissionPath;
    }

    public void setSubmissionPath(String submissionPath) {
        this.submissionPath = submissionPath;
    }

    public void setWebsitesNamesChosen(ArrayList<String> websitesNamesChosen) {
        this.websitesNamesChosen = websitesNamesChosen;
    }

    public ArrayList<String> getWebsitesNamesChosen() {
        return websitesNamesChosen;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }
    public String getContentRating() {
        return contentRating;
    }
}
