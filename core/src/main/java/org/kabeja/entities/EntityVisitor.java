package org.kabeja.entities;

public interface EntityVisitor {

	Object visit(Entity entity);
	
	Object visit(Attrib attrib);
	
	Object visit(Insert insert);
	
	Object visit(MText mText);
	
	Object visit(LWPolyline lwPolyline);
	
	Object visit(Polyline polyline);
	
	Object visit(Text text);
	
	Object visit(Vertex vertex);
}
