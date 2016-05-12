package org.kabeja.entities;

public interface EntityAccept {

	Object accept(EntityVisitor entityVisitor);
}
