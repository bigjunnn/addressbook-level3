package seedu.address.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.details.ExerciseDetail;
import seedu.address.model.details.Sets;

public class JsonAdaptedSets<Integer> extends JsonAdaptedExerciseDetail {

    private static final String DETAILTYPE = "Sets";

    /**
     * Constructs a {@code JsonAdaptedRepetitions} with the given {@code magnitude}
     * and {@code unit}.
     */
    @JsonCreator
    public JsonAdaptedSets(@JsonProperty("magnitude") int magnitude){
        this.type = DETAILTYPE;
        this.magnitude = magnitude;
    }

    /**
     * Converts a given {@code Weight} into this class for Jackson use.
     * @param source
     */
    public JsonAdaptedSets(Sets source) {
        this.type = DETAILTYPE;
        this.magnitude = source.getMagnitude();
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")

    /**
     * Converts this Jackson-friendly adapted tag object into the model's {@code ExerciseDetail} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted tag.
     */
    public ExerciseDetail toModelType() {
        return new Sets((java.lang.Integer) magnitude);
    }

}
