package de.sonallux.spotify.api.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SnapshotId {
    /**
     * <p>The snapshot_id can be used to identify your playlist version in future requests.</p>
     */
    public String snapshotId;
}
