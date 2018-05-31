package entity;

/*
 *kpiָ���
 * */
public class Kpiindex {
	private int kpiIndexID;// pkiָ��ID
	private String kpiIndexName;// kpi����
	private int moduleID;// kpiģ��
	private int postID;// ��λID
	private String weight;// Ȩ��
	private String span;// ȡֵ��Χ
	private String indexDefinition;// ָ������
	private String dateSources;// ������Դ
	private String computationalFormula;// ���㹫ʽ
	private String annualObjectives;// ���Ŀ��
	private String quarterlyAccounting;// ���Ⱥ���
	private String currentTarget;// ����Ŀ��
	private String currentReality;// ����ʵ��
	private String currentYieldRate;// ���ڴ����
	private String currentScore;// ���ڵ÷�

	public int getKpiIndexID() {
		return kpiIndexID;
	}

	public void setKpiIndexID(int kpiIndexID) {
		this.kpiIndexID = kpiIndexID;
	}

	public String getKpiIndexName() {
		return kpiIndexName;
	}

	public void setKpiIndexName(String kpiIndexName) {
		this.kpiIndexName = kpiIndexName;
	}

	public int getModuleID() {
		return moduleID;
	}

	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSpan() {
		return span;
	}

	public void setSpan(String span) {
		this.span = span;
	}

	public String getIndexDefinition() {
		return indexDefinition;
	}

	public void setIndexDefinition(String indexDefinition) {
		this.indexDefinition = indexDefinition;
	}

	public String getDateSources() {
		return dateSources;
	}

	public void setDateSources(String dateSources) {
		this.dateSources = dateSources;
	}

	public String getComputationalFormula() {
		return computationalFormula;
	}

	public void setComputationalFormula(String computationalFormula) {
		this.computationalFormula = computationalFormula;
	}

	public String getAnnualObjectives() {
		return annualObjectives;
	}

	public void setAnnualObjectives(String annualObjectives) {
		this.annualObjectives = annualObjectives;
	}

	public String getQuarterlyAccounting() {
		return quarterlyAccounting;
	}

	public void setQuarterlyAccounting(String quarterlyAccounting) {
		this.quarterlyAccounting = quarterlyAccounting;
	}

	public String getCurrentTarget() {
		return currentTarget;
	}

	public void setCurrentTarget(String currentTarget) {
		this.currentTarget = currentTarget;
	}

	public String getCurrentReality() {
		return currentReality;
	}

	public void setCurrentReality(String currentReality) {
		this.currentReality = currentReality;
	}

	public String getCurrentYieldRate() {
		return currentYieldRate;
	}

	public void setCurrentYieldRate(String currentYieldRate) {
		this.currentYieldRate = currentYieldRate;
	}

	public String getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(String currentScore) {
		this.currentScore = currentScore;
	}

	public Kpiindex(int kpiIndexID, String kpiIndexName, int moduleID, int postID, String weight, String span,
			String indexDefinition, String dateSources, String computationalFormula, String annualObjectives,
			String quarterlyAccounting, String currentTarget, String currentReality, String currentYieldRate,
			String currentScore) {
		super();
		this.kpiIndexID = kpiIndexID;
		this.kpiIndexName = kpiIndexName;
		this.moduleID = moduleID;
		this.postID = postID;
		this.weight = weight;
		this.span = span;
		this.indexDefinition = indexDefinition;
		this.dateSources = dateSources;
		this.computationalFormula = computationalFormula;
		this.annualObjectives = annualObjectives;
		this.quarterlyAccounting = quarterlyAccounting;
		this.currentTarget = currentTarget;
		this.currentReality = currentReality;
		this.currentYieldRate = currentYieldRate;
		this.currentScore = currentScore;
	}

	public Kpiindex() {
		super();
	}

}
