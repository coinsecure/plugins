/*
 * SWGDoubleData.h
 * 
 * 
 */

#ifndef SWGDoubleData_H_
#define SWGDoubleData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGDoubleData: public SWGObject {
public:
    SWGDoubleData();
    SWGDoubleData(QString* json);
    virtual ~SWGDoubleData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGDoubleData* fromJson(QString &jsonString);

    double getPercent();
    void setPercent(double percent);

private:
    double percent;
};

} /* namespace Swagger */

#endif /* SWGDoubleData_H_ */
